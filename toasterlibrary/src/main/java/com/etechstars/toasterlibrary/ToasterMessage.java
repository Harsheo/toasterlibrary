package com.etechstars.toasterlibrary;

import android.widget.Toast;
import android.content.Context;


public class ToasterMessage {
    public static void s(Context c,String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
