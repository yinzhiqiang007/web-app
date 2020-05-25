package com.quinn.app.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.quinn.app.common.util.CommonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

public class AesUtil{
	private static Logger logger = LoggerFactory.getLogger(AesUtil.class);
	private static final String transformation = "AES/ECB/NoPadding";
	private static final String algorithm = "AES";

	static public void encryptFile(String srcFilePath, String targetFilePath, String cipherKey)
			throws IOException, GeneralSecurityException {
		processFile(srcFilePath, targetFilePath, cipherKey, true);
	}

	static public void decryptFile(String srcFilePath, String targetFilePath, String cipherKey)
			throws IOException, GeneralSecurityException {
		processFile(srcFilePath, targetFilePath, cipherKey, false);
	}

	static public void decryptFile(InputStream fis, String targetFilePath, String cipherKey)
			throws IOException, GeneralSecurityException {
		processFile(fis, targetFilePath, cipherKey, false);
	}

	static public void processFile(String srcFilePath, String targetFilePath, String cipherKey, boolean encrypt)
			throws IOException, GeneralSecurityException {

		File srcFile = new File(srcFilePath);
		if (!srcFile.exists()) {
			logger.warn("file not exist " + srcFilePath);
			return;
		}

		int bufferLength = 1024;
		byte[] buffer = new byte[bufferLength];

		FileInputStream fis = null;
		FileOutputStream fos = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		String keyString = cipherKey.substring(0, 16);
		SecretKeySpec key = new SecretKeySpec(keyString.getBytes(), algorithm);
		Cipher cipher;
		try {
			cipher = Cipher.getInstance(transformation);
			cipher.init(encrypt ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE, key);
		} catch (NoSuchAlgorithmException | NoSuchPaddingException  ex) {
			ex.printStackTrace();
			return;
		} catch (InvalidKeyException ex) {
			logger.warn("{}: invalid cipher key: {}", ex.getMessage(), keyString);
			return;
		}

		int length = 0;
		try {
			fis = new FileInputStream(srcFilePath);
			int bytes = 0;
			byte[] lengthBytes = new byte[4];
			if (!encrypt && fis.read(lengthBytes, 0, 4) != -1) {
				length = ByteBuffer.wrap(lengthBytes).order(ByteOrder.LITTLE_ENDIAN).getInt(0);
				System.out.println("original length: " + length);
			}

			while ((bytes = fis.read(buffer)) != -1) {
				baos.write(buffer, 0, bytes);
			}
		} catch (IOException e) {
			logger.warn("{}: cannot open or read the content of file: {}",
					e.getMessage(), srcFilePath);
			return;
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				throw e;
			}
		}

		if (encrypt) {
			length = baos.size();
			int paddingLength = 16 - length % 16;
			if (paddingLength < 16) {
				try {
					baos.write(new byte[paddingLength]);
				} catch (IOException e) {
					return;
				}
			}
		}

		byte[] output = null;
		try {
			output = encrypt ?
					cipher.doFinal(baos.toByteArray()):
					cipher.doFinal(baos.toByteArray());
		} catch (IllegalBlockSizeException | BadPaddingException ex) {
			throw ex;
		}

		try {
			baos.close();
		} catch (IOException ex) {
			throw ex;
		}

		if (output != null) {
			try {
				fos = new FileOutputStream(targetFilePath);
				if (encrypt) {
					byte[] lengthByte = new byte[4];
					ByteBuffer.wrap(lengthByte).order(ByteOrder.LITTLE_ENDIAN).putInt(0, length);
					fos.write(lengthByte);
					length = output.length;
				}
				fos.write(output, 0, length);
			} catch (IOException e) {
				logger.warn("{}: cannot open or write the content to file: {}",
						e.getMessage(), targetFilePath);
			} finally {
				try {
					if (fos != null) {
						fos.close();
					}
				} catch (IOException e) {
					throw e;
				}
			}
		}
	}



	static public void processFile(InputStream fis, String targetFilePath, String cipherKey, boolean encrypt)
			throws IOException, GeneralSecurityException {


		int bufferLength = 1024;
		byte[] buffer = new byte[bufferLength];


		FileOutputStream fos = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		String keyString = cipherKey.substring(0, 16);
		SecretKeySpec key = new SecretKeySpec(keyString.getBytes(), algorithm);
		Cipher cipher;
		try {
			cipher = Cipher.getInstance(transformation);
			cipher.init(encrypt ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE, key);
		} catch (NoSuchAlgorithmException | NoSuchPaddingException  ex) {
			ex.printStackTrace();
			return;
		} catch (InvalidKeyException ex) {
			logger.warn("{}: invalid cipher key: {}", ex.getMessage(), keyString);
			return;
		}

		int length = 0;
		try {
			int bytes = 0;
			byte[] lengthBytes = new byte[4];
			if (!encrypt && fis.read(lengthBytes, 0, 4) != -1) {
				length = ByteBuffer.wrap(lengthBytes).order(ByteOrder.LITTLE_ENDIAN).getInt(0);
				System.out.println("original length: " + length);
			}

			while ((bytes = fis.read(buffer)) != -1) {
				baos.write(buffer, 0, bytes);
			}
		} catch (IOException e) {
			logger.warn("{}: cannot open or read the content of file: ",
					e.getMessage(),e);
			return;
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				throw e;
			}
		}

		if (encrypt) {
			length = baos.size();
			int paddingLength = 16 - length % 16;
			if (paddingLength < 16) {
				try {
					baos.write(new byte[paddingLength]);
				} catch (IOException e) {
					return;
				}
			}
		}

		byte[] output = null;
		try {
			output = encrypt ?
					cipher.doFinal(baos.toByteArray()):
					cipher.doFinal(baos.toByteArray());
		} catch (IllegalBlockSizeException | BadPaddingException ex) {
			throw ex;
		}

		try {
			baos.close();
		} catch (IOException ex) {
			throw ex;
		}

		if (output != null) {
			try {
				fos = new FileOutputStream(targetFilePath);
				if (encrypt) {
					byte[] lengthByte = new byte[4];
					ByteBuffer.wrap(lengthByte).order(ByteOrder.LITTLE_ENDIAN).putInt(0, length);
					fos.write(lengthByte);
					length = output.length;
				}
				fos.write(output, 0, length);
			} catch (IOException e) {
				logger.warn("{}: cannot open or write the content to file: {}",
						e.getMessage(), targetFilePath);
			} finally {
				try {
					if (fos != null) {
						fos.close();
					}
				} catch (IOException e) {
					throw e;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException, GeneralSecurityException {
		Map<String,Object> map = (Map<String, Object>) JSON.parse("");
		Map<String,Object> dataMap = (Map<String, Object>) map.get("data");
		JSONArray jsonArray = (JSONArray) dataMap.get("images");

		for(Object jsonObject:jsonArray){
			Map<String,Object> objectMap = (Map<String, Object>) jsonObject;
			URL url =new URL(objectMap.get("url").toString());
			decryptFile(url.openStream(), "C:\\Users\\yin.zhiqiang\\Desktop\\dddd\\"+CommonUtils.getUUIDString()+".jpg", objectMap.get("password").toString());
		}
		System.out.println(jsonArray.size());
//		decryptFile("C:\\Users\\yin.zhiqiang\\Downloads\\2020Y05M21D18H27M22S00.180.jpg", "C:\\Users\\yin.zhiqiang\\Desktop\\dddd\\"+ CommonUtils.getUUIDString() +".jpg", "a7169900e64a144b14f83bcc56ba107b");

	}
}
