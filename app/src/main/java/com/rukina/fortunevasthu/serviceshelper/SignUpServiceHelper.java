package com.rukina.fortunevasthu.serviceshelper;

import android.content.Context;
import android.util.Log;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.rukina.fortunevasthu.R;
import com.rukina.fortunevasthu.activity.MainActivity;
import com.rukina.fortunevasthu.app.AppController;
import com.rukina.fortunevasthu.serviceinterfaces.IServiceListener;
import com.rukina.fortunevasthu.serviceinterfaces.ISignUpServiceListener;
import com.rukina.fortunevasthu.utils.Config;
import com.rukina.fortunevasthu.utils.FortuneConstants;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

/**
 * Created by zahid.r on 10/30/2015.
 */
public class SignUpServiceHelper {
    private String TAG = MainActivity.class.getSimpleName();
    private Context context;
    ISignUpServiceListener signUpServiceListener;


    public SignUpServiceHelper(Context context) {
        this.context = context;
    }

    public void setSignUpServiceListener(ISignUpServiceListener signUpServiceListener) {
        this.signUpServiceListener = signUpServiceListener;
    }

    public void makeGetEventServiceCall(String URL) {
        Log.d(TAG, "Events URL " + URL);
        final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET,
                URL, (String) null,
                new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d(TAG, "ajaz : " + response.toString());
                        if(response != null) {
                            signUpServiceListener.onSignUp(response);
                        }
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(TAG, "error is" + error.getLocalizedMessage());
                if (error.networkResponse != null && error.networkResponse.data != null) {

                    try {
                        String responseBody = new String(error.networkResponse.data, "utf-8");
                        Log.d(TAG, "error response body is" + responseBody);
                        JSONObject jsonObject = new JSONObject(responseBody);
                        signUpServiceListener.onSignUpError(jsonObject.getString(Config.PARAM_MESSAGE));
                    } catch (UnsupportedEncodingException e) {
                        signUpServiceListener.onSignUpError(context.getResources().getString(R.string.error_occured));
                        e.printStackTrace();
                    } catch (JSONException e) {
                        signUpServiceListener.onSignUpError(context.getResources().getString(R.string.error_occured));
                        e.printStackTrace();
                    }

                } else {
                    signUpServiceListener.onSignUpError(context.getResources().getString(R.string.error_occured));
                }
            }
        });

        jsonObjectRequest.setRetryPolicy(new DefaultRetryPolicy(0, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjectRequest);


    }

    public void updateUserProfile(String url, final IServiceListener listener){
        Log.d(TAG,"updateprofile URL"+ url);
        final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET,
                url, (String) null,
                new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d(TAG, response.toString());
                        try {
                            //Parse the response and convert to Java class
                            listener.onSuccess(0,response);

                        }catch(Exception e){
                            Log.d(TAG,"Exception while parsing");
                            e.printStackTrace();
                            listener.onError("JSON Parser error");
                        }
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                if (error.networkResponse != null && error.networkResponse.data != null) {

                    try {
                        String responseBody = new String(error.networkResponse.data, "utf-8");
                        JSONObject jsonObject = new JSONObject(responseBody);
                        listener.onError(jsonObject.getString(FortuneConstants.PARAM_MESSAGE));
                    } catch (UnsupportedEncodingException e) {
                        listener.onError(context.getResources().getString(R.string.error_occured));
                        e.printStackTrace();
                    } catch (JSONException e) {
                        listener.onError(context.getResources().getString(R.string.error_occured));
                        e.printStackTrace();
                    }

                } else {
                    listener.onError(context.getResources().getString(R.string.error_occured));
                }
            }
        });

        jsonObjectRequest.setRetryPolicy(new DefaultRetryPolicy(0, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjectRequest);
    }

}
