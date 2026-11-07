package com.ayah.feature.picker.book.view;

import H8.e;
import M.k;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.S;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import p017b7.g;
import p030c9.f;
import p030c9.j;
import p035d3.o;
import p051e9.b;
import p174r3.l;
import p218w3.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_ChooseBookPage extends BottomSheetDialogFragment implements b {

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public j f13824E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f13825F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public volatile f f13826G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final Object f13827H0 = new Object();

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f13828I0 = false;

    @Override // androidx.fragment.app.DialogFragment, p056f2.AbstractComponentCallbacksC0947u
    public final LayoutInflater E(Bundle bundle) {
        LayoutInflater layoutInflaterE = super.E(bundle);
        return layoutInflaterE.cloneInContext(new j(layoutInflaterE, this));
    }

    public final void W() {
        if (this.f13824E0 == null) {
            this.f13824E0 = new j(super.l(), this);
            this.f13825F0 = g.i0(super.l());
        }
    }

    public final void X() {
        if (this.f13828I0) {
            return;
        }
        this.f13828I0 = true;
        o oVar = (o) ((E5.f) c());
        ((ChooseBookPage) this).L0 = new k((l) oVar.f15632a.f15674r.get(), (n) oVar.f15633b.f15629d.get());
    }

    @Override // p051e9.b
    public final Object c() {
        if (this.f13826G0 == null) {
            synchronized (this.f13827H0) {
                try {
                    if (this.f13826G0 == null) {
                        this.f13826G0 = new f(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f13826G0.c();
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u, androidx.lifecycle.InterfaceC0762k
    public final S e() {
        S sE = super.e();
        p035d3.l lVar = ((o) ((p018b9.b) AbstractC0813f2.C(this, p018b9.b.class))).f15634c;
        e eVar = new e(26);
        sE.getClass();
        return new p018b9.f(sE, eVar);
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final Context l() {
        if (super.l() == null && !this.f13825F0) {
            return null;
        }
        W();
        return this.f13824E0;
    }

    @Override // p056f2.AbstractComponentCallbacksC0947u
    public final void x(Activity activity) {
        boolean z10 = true;
        this.f16143V = true;
        Context baseContext = this.f13824E0;
        if (baseContext != null) {
            while ((baseContext instanceof ContextWrapper) && !(baseContext instanceof Activity)) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (baseContext != activity) {
                z10 = false;
            }
        }
        p050e8.b.l(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        W();
        X();
    }

    @Override // androidx.fragment.app.DialogFragment, p056f2.AbstractComponentCallbacksC0947u
    public void y(Context context) {
        super.y(context);
        W();
        X();
    }
}
