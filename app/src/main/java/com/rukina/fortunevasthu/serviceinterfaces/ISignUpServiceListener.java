package com.rukina.fortunevasthu.serviceinterfaces;



import org.json.JSONObject;

/**
 * Created by zahid.r on 10/30/2015.
 */
public interface ISignUpServiceListener {
    void onSignUp(JSONObject response);

    void onSignUpError(String error);
}
