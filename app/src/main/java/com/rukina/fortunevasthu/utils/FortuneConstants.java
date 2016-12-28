package com.rukina.fortunevasthu.utils;

/**
 * Created by Nandha on 06-12-2016.
 */

public class FortuneConstants {

    // used to share GCM regId with application server - using php app server

    public static final String BASE_URL = "http://vastu.crystalpro.net/app/";
    public static final String APP_SERVER_URL = BASE_URL+"login?username=%s&password=%s";
    public static final String REG_USER = BASE_URL+"api.php?func_name=UserRegister&reg_name=%s&reg_mobile=%s&reg_email=%s&reg_gcm_key=%s";
    public static final String GET_FREE_REPORT = BASE_URL+"api.php?func_name=getFreeReport&m_entrance=%s&hall=%s&kitchen=%s&m_bedroom=%s&bed_room=%s&pooja_room=%s&bath_room=%s&portico=%s&car_parking=%s&stair_case=%s&bore_well=%s&septic_tank=%s&compound_wall=%s&road=%s&name=%s&reg_mobile=%s&reg_email=%s&gcm_key=%s";

    // Google Project Number
    public static final String GOOGLE_PROJECT_ID = "789502099085";
    public static final String MESSAGE_KEY = "message";

    public static String PARAM_MESSAGE = "msg";

    public static final String GET_SIGN_UP_URL = "http://hobbistan.com/app/hobbistan/api.php?";

    // Alert Dialog Constants
    public static String ALERT_DIALOG_TITLE = "alertDialogTitle";
    public static String ALERT_DIALOG_MESSAGE = "alertDialogMessage";
    public static String ALERT_DIALOG_TAG = "alertDialogTag";
    public static String ALERT_DIALOG_INPUT_HINT = "alert_dialog_input_hint";
    public static String ALERT_DIALOG_POS_BUTTON = "alert_dialog_pos_button";
    public static String ALERT_DIALOG_NEG_BUTTON = "alert_dialog_neg_button";

    // Analysis Report Input
    public static String KEY_MAIN_ENTRANCE = "main_entrance";
    public static String KEY_HALL = "hall";
    public static String KEY_KITCHEN = "kitchen";
    public static String KEY_MASTER_BED_ROOM = "master_bed_room";
    public static String KEY_BED_ROOM = "bed_room";
    public static String KEY_POOJA_ROOM = "pooja_room";
    public static String KEY_BATH_AND_TOILET = "bath_and_toilet";
    public static String KEY_PORTICO = "portico";
    public static String KEY_CAR_PARKING = "car_parking";
    public static String KEY_STAIR_CASE = "stair_case";
    public static String KEY_SUMP_BOREWELL = "sump_borewell";
    public static String KEY_SEPTIC_TANK = "septic_tank";
    public static String KEY_COMPOUND_WALL = "compound_wall";
    public static String KEY_ROAD = "road";

}
