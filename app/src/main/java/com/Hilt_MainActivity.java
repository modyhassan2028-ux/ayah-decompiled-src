package com.ayah;

import I5.a;
import X4.c;
import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.S;
import p051e9.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_MainActivity extends AppCompatActivity implements b {
    public c S;
    public volatile p030c9.b T;
    public final Object U = new Object();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f13621V = false;

    public Hilt_MainActivity() {
        k(new a(this, 4));
    }

    @Override // p051e9.b
    public final Object c() {
        return r().c();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.InterfaceC0762k
    public final S e() {
        return p050e8.b.t(this, super.e());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof b) {
            c cVarD = r().d();
            this.S = cVarD;
            if (cVarD.k()) {
                this.S.f9953r = f();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c cVar = this.S;
        if (cVar != null) {
            cVar.f9953r = null;
        }
    }

    public final p030c9.b r() {
        if (this.T == null) {
            synchronized (this.U) {
                try {
                    if (this.T == null) {
                        this.T = new p030c9.b((Activity) this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.T;
    }
}
