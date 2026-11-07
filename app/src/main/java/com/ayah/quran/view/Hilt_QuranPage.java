package com.ayah.feature.quran.view;

import android.view.ViewGroup;
import p030c9.f;
import p051e9.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_QuranPage extends ViewGroup implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f13831r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13832s;

    @Override // p051e9.b
    public final Object c() {
        if (this.f13831r == null) {
            this.f13831r = new f(this);
        }
        return this.f13831r.c();
    }
}
