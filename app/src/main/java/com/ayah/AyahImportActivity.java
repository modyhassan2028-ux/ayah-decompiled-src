package com.ayah;

import Da.r;
import K9.AbstractC0405x;
import P9.d;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import p035d3.C0927i;
import p035d3.DialogInterfaceOnClickListenerC0926h;
import p084i.C0956d;
import p084i.DialogInterfaceC0959g;
import p125m4.b;
import p166q4.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class AyahImportActivity extends Hilt_AyahImportActivity {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final /* synthetic */ int f13611c0 = 0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public a f13612W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final d f13613X = AbstractC0405x.d();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Uri f13614Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Dialog f13615Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f13616a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f13617b0;

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        j.e(context, "newBase");
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.setLocale(b.a());
        super.attachBaseContext(context.createConfigurationContext(configuration));
    }

    @Override // com.ayah.Hilt_AyahImportActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13614Y = getIntent().getData();
        this.f13616a0 = bundle != null ? bundle.getBoolean("SI_IS_RESTORING", false) : false;
        boolean z10 = bundle != null ? bundle.getBoolean("SI_IS_SHOWING_ERROR", false) : false;
        this.f13617b0 = z10;
        if (this.f13614Y == null || z10) {
            t();
            return;
        }
        if (this.f13616a0) {
            u();
            return;
        }
        r rVar = new r(this);
        C0956d c0956d = (C0956d) rVar.f1388t;
        c0956d.f16560d = c0956d.f16557a.getText(R.string.restore_title);
        c0956d.f16562f = c0956d.f16557a.getText(R.string.restore_description);
        c0956d.f16565k = false;
        DialogInterfaceOnClickListenerC0926h dialogInterfaceOnClickListenerC0926h = new DialogInterfaceOnClickListenerC0926h(this, 0);
        c0956d.g = c0956d.f16557a.getText(R.string.restore);
        c0956d.f16563h = dialogInterfaceOnClickListenerC0926h;
        DialogInterfaceOnClickListenerC0926h dialogInterfaceOnClickListenerC0926h2 = new DialogInterfaceOnClickListenerC0926h(this, 1);
        c0956d.f16564i = c0956d.f16557a.getText(android.R.string.cancel);
        c0956d.j = dialogInterfaceOnClickListenerC0926h2;
        DialogInterfaceC0959g dialogInterfaceC0959gE = rVar.e();
        dialogInterfaceC0959gE.show();
        this.f13615Z = dialogInterfaceC0959gE;
    }

    @Override // com.ayah.Hilt_AyahImportActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        s();
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        j.e(bundle, "outState");
        bundle.putBoolean("SI_IS_RESTORING", this.f13616a0);
        bundle.putBoolean("SI_IS_SHOWING_ERROR", this.f13617b0);
        super.onSaveInstanceState(bundle);
    }

    public final void s() {
        Dialog dialog = this.f13615Z;
        if (dialog != null) {
            j.b(dialog);
            dialog.dismiss();
            this.f13615Z = null;
        }
    }

    public final void t() {
        r rVar = new r(this);
        C0956d c0956d = (C0956d) rVar.f1388t;
        c0956d.f16560d = c0956d.f16557a.getText(R.string.restore_error);
        c0956d.f16562f = c0956d.f16557a.getText(R.string.restore_error_desc);
        c0956d.f16565k = false;
        DialogInterfaceOnClickListenerC0926h dialogInterfaceOnClickListenerC0926h = new DialogInterfaceOnClickListenerC0926h(this, 2);
        c0956d.g = c0956d.f16557a.getText(android.R.string.ok);
        c0956d.f16563h = dialogInterfaceOnClickListenerC0926h;
        DialogInterfaceC0959g dialogInterfaceC0959gE = rVar.e();
        dialogInterfaceC0959gE.show();
        this.f13615Z = dialogInterfaceC0959gE;
        this.f13617b0 = true;
    }

    public final void u() {
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(getString(R.string.please_wait));
        progressDialog.setCancelable(false);
        this.f13615Z = progressDialog;
        progressDialog.show();
        Uri uri = this.f13614Y;
        if (uri != null) {
            AbstractC0405x.x(this.f13613X, null, new C0927i(this, uri, null, 1), 3);
        }
        this.f13616a0 = true;
    }
}
