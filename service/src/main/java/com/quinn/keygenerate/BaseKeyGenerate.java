package com.quinn.keygenerate;

/**
 * @author Quinn
 * @date 2018/3/2
 * @package com.quinn.keygenerate
 */
public abstract class BaseKeyGenerate implements KeyGenerate {
    @Override
    public String generateStringKey(KeyGenerateEnum em) {
        return em.name()+generateLongKey(em);
    }

    @Override
    public Long generateLongKey(KeyGenerateEnum em) {
        long d = System.currentTimeMillis();
        int dd = (int) ((Math.random() * 9 + 1) * 100000);
        return Long.parseLong(d+""+dd);
    }

}
