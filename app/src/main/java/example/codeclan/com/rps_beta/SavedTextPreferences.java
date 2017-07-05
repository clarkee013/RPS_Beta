package example.codeclan.com.rps_beta;

/**
 * Created by user on 05/07/2017.
 */
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import static android.R.attr.lines;


public class SavedTextPreferences {
    private static final String PREF_SAVEDTEXT = "saved text";

    public static void setGameStreak(Context context, String text){

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);

        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(PREF_SAVEDTEXT, text);
        editor.apply();
    }

    public static String getGameStreak(Context context){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);

        return sharedPreferences.getString(PREF_SAVEDTEXT, null);
    }

}