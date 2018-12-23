package com.example.alisongou.crimeIntent;

import java.util.UUID;

/**
 * Created by alisongou on 12/19/18.
 */

public class Crime {
    private UUID mId;
    private String mTitile;

    public Crime(){
        //generate unique identifier
        mId=UUID.randomUUID();

    }

    public UUID getmId() {
        return mId;
    }



    public String getmTitile() {
        return mTitile;
    }

    public void setmTitile(String mTitile) {
        this.mTitile = mTitile;
    }
}
