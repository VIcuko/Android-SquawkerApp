package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;

/**
 * Created by Vicuko on 11/2/19.
 */
// TODO (1) Make a new package for your FCM service classes called "fcm" - Done
// TODO (2) Create a new Service class that extends FirebaseInstanceIdService. - Done
// You'll need to implement the onTokenRefresh method. Simply have it print out
// the new token.

public class SquawkFirebaseInstanceIdService extends FirebaseMessagingService {

    private String TAG = getClass().getSimpleName();

    @Override
    public void onNewToken(String token) {
        Log.d(TAG, "Refreshed token: " + token);
        sendRegistrationToServer(token);
    }

    private void sendRegistrationToServer(String token) {
    }
}
