package com.rukina.fortunevasthu.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Nandha on 25-12-2016.
 */

public class PreferenceStorage {

//    MainEntrance
    public static void saveMainEntrance(Context context, String userId) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FortuneConstants.KEY_MAIN_ENTRANCE, userId);
        editor.commit();
    }

    public static String getMainEntrance(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        String userId = sharedPreferences.getString(FortuneConstants.KEY_MAIN_ENTRANCE, "");
        return userId;
    }

//    Hall
    public static void saveHall(Context context, String hall) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FortuneConstants.KEY_HALL, hall);
        editor.commit();
    }

    public static String getHall(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        String hall = sharedPreferences.getString(FortuneConstants.KEY_HALL, "");
        return hall;
    }

//    Kitchen
    public static void saveKitchen(Context context, String kitchen) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FortuneConstants.KEY_KITCHEN, kitchen);
        editor.commit();
    }

    public static String getKitchen(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        String kitchen = sharedPreferences.getString(FortuneConstants.KEY_KITCHEN, "");
        return kitchen;
    }

//    MasterBedRoom
    public static void saveMasterBedRoom(Context context, String masterBedRoom) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FortuneConstants.KEY_MASTER_BED_ROOM, masterBedRoom);
        editor.commit();
    }

    public static String getMasterBedRoom(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        String masterBedRoom = sharedPreferences.getString(FortuneConstants.KEY_MASTER_BED_ROOM, "");
        return masterBedRoom;
    }

//    BedRoom
    public static void saveBedRoom(Context context, String bedRoom) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FortuneConstants.KEY_BED_ROOM, bedRoom);
        editor.commit();
    }

    public static String getBedRoom(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        String bedRoom = sharedPreferences.getString(FortuneConstants.KEY_BED_ROOM, "");
        return bedRoom;
    }

//    PoojaRoom
    public static void savePoojaRoom(Context context, String poojaRoom) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FortuneConstants.KEY_POOJA_ROOM, poojaRoom);
        editor.commit();
    }

    public static String getPoojaRoom(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        String poojaRoom = sharedPreferences.getString(FortuneConstants.KEY_POOJA_ROOM, "");
        return poojaRoom;
    }

//    BathAndToilet
    public static void saveBathAndToilet(Context context, String bathAndToilet) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FortuneConstants.KEY_BATH_AND_TOILET, bathAndToilet);
        editor.commit();
    }

    public static String getBathAndToilet(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        String BathAndToilet = sharedPreferences.getString(FortuneConstants.KEY_BATH_AND_TOILET, "");
        return BathAndToilet;
    }

//    Portico
    public static void savePortico(Context context, String portico) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FortuneConstants.KEY_PORTICO, portico);
        editor.commit();
    }

    public static String getPortico(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        String portico = sharedPreferences.getString(FortuneConstants.KEY_PORTICO, "");
        return portico;
    }

//    CarParking
    public static void saveCarParking(Context context, String carParking) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FortuneConstants.KEY_CAR_PARKING, carParking);
        editor.commit();
    }

    public static String getCarParking(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        String carParking = sharedPreferences.getString(FortuneConstants.KEY_CAR_PARKING, "");
        return carParking;
    }

//    StairCase
    public static void saveStairCase(Context context, String stairCase) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FortuneConstants.KEY_STAIR_CASE, stairCase);
        editor.commit();
    }

    public static String getStairCase(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        String stairCase = sharedPreferences.getString(FortuneConstants.KEY_STAIR_CASE, "");
        return stairCase;
    }

//    SumpBorewell
    public static void saveSumpBorewell(Context context, String sumpBorewell) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FortuneConstants.KEY_SUMP_BOREWELL, sumpBorewell);
        editor.commit();
    }

    public static String getSumpBorewell(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        String sumpBorewell = sharedPreferences.getString(FortuneConstants.KEY_SUMP_BOREWELL, "");
        return sumpBorewell;
    }

//    SepticTank
    public static void saveSepticTank(Context context, String septicTank) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FortuneConstants.KEY_SEPTIC_TANK, septicTank);
        editor.commit();
    }

    public static String getSepticTank(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        String septicTank = sharedPreferences.getString(FortuneConstants.KEY_SEPTIC_TANK, "");
        return septicTank;
    }

//    CompoundWall
    public static void saveCompoundWall(Context context, String compoundWall) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FortuneConstants.KEY_COMPOUND_WALL, compoundWall);
        editor.commit();
    }

    public static String getCompoundWall(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        String compoundWall = sharedPreferences.getString(FortuneConstants.KEY_COMPOUND_WALL, "");
        return compoundWall;
    }

//    Road
    public static void saveRoad(Context context, String road) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FortuneConstants.KEY_ROAD, road);
        editor.commit();
    }

    public static String getRoad(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        String road = sharedPreferences.getString(FortuneConstants.KEY_ROAD, "");
        return road;
    }
}
