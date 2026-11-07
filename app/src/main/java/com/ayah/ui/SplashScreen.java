package com.ayah.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.appcompat.app.AppCompatActivity;
import com.ayah.MainActivity;
import com.ayah.feature.onboarding.OnboardingActivity;

/* JADX INFO: loaded from: classes.dex */
public class SplashScreen extends AppCompatActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if (defaultSharedPreferences.getBoolean("shouldShowOnboarding", false)) {
            startActivity(new Intent(this, (Class<?>) OnboardingActivity.class));
            defaultSharedPreferences.edit().remove("shouldShowOnboarding").apply();
        } else {
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
        }
        finish();
    }
}
