package com.quinn.keygenerate;

/**
 * @author Quinn
 * @date 2018/3/2
 * @package com.quinn.keygenerate
 */
public interface KeyGenerate {

    public final static String keys = "KEY_GENERATE";

    /**
     * 生成String类型主键
     * @param em
     * @return
     */
    public String generateStringKey(KeyGenerateEnum em);
    /**
     * 生成long类型主键
     * @param em
     * @return
     */
    public Long generateLongKey(KeyGenerateEnum em);

    /**
     * Demo - id
     * @return
     */
    public Long getCaseId();
}
