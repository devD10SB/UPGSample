package com.neopad.upglib;

import android.content.Context;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by SBChoo on 2017-07-20.
 */

public class UPGTest {

    private Context mContext;

    public UPGTest(Context context){
        mContext = context;
    }

    public String upgResult(){
        byte[] result = DigestUtils.md5("1234");
        String mEncodeResult = new String(Hex.encodeHex(result));
        return mEncodeResult;
    }
}
