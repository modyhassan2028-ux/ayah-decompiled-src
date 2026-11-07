package com.ayah.ui;

import H8.e;
import J3.x;
import M.k;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.S;
import androidx.preference.PreferenceFragmentCompat;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import p017b7.g;
import p030c9.f;
import p030c9.j;
import p035d3.l;
import p035d3.o;
import p035d3.u;
import p051e9.b;
import p158p6.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_PreferencesFragment extends PreferenceFragmentCompat implements b {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public j f13934w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f13935x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public volatile f f13936y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final Object f13937z0 = new Object();

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f13933A0 = false;

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final LayoutInflater E(Bundle bundle) {
        LayoutInflater layoutInflaterE = super.E(bundle);
        return layoutInflaterE.cloneInContext(new j(layoutInflaterE, this));
    }

    public final void U() {
        if (this.f13934w0 == null) {
            this.f13934w0 = new j(super.l(), this);
            this.f13935x0 = g.i0(super.l());
        }
    }

    public final void V() {
        if (this.f13933A0) {
            return;
        }
        this.f13933A0 = true;
        PreferencesFragment preferencesFragment = (PreferencesFragment) this;
        u uVar = ((o) ((c) c())).f15632a;
        preferencesFragment.f13942F0 = (x) uVar.f15666i.get();
        preferencesFragment.f13943G0 = new k(uVar.b());
    }

    @Override // p051e9.b
    public final Object c() {
        if (this.f13936y0 == null) {
            synchronized (this.f13937z0) {
                try {
                    if (this.f13936y0 == null) {
                        this.f13936y0 = new f(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f13936y0.c();
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u, androidx.lifecycle.InterfaceC0762k
    public final S e() {
        S sE = super.e();
        l lVar = ((o) ((p018b9.b) AbstractC0813f2.C(this, p018b9.b.class))).f15634c;
        e eVar = new e(26);
        sE.getClass();
        return new p018b9.f(sE, eVar);
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final Context l() {
        if (super.l() == null && !this.f13935x0) {
            return null;
        }
        U();
        return this.f13934w0;
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final void x(Activity activity) {
        boolean z10 = true;
        this.f16143V = true;
        Context baseContext = this.f13934w0;
        if (baseContext != null) {
            while ((baseContext instanceof ContextWrapper) && !(baseContext instanceof Activity)) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (baseContext != activity) {
                z10 = false;
            }
        }
        p050e8.b.l(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        U();
        V();
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final void y(Context context) {
        super.y(context);
        U();
        V();
    }
}
