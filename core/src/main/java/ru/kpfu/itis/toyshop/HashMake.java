package ru.kpfu.itis.toyshop;

import org.springframework.stereotype.Component;
import org.apache.commons.codec.digest.DigestUtils;

@Component
public class HashMake {

    public String md5Apache(String str) {
        return DigestUtils.md5Hex(str);
    }
}

