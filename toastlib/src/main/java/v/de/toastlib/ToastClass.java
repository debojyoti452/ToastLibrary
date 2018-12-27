package v.de.toastlib;

import android.content.Context;
import android.widget.Toast;

public class ToastClass {
    public static void mtoast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
