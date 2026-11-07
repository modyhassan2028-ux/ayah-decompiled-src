package com.ayah.feature.quran.view;

import android.view.View;
import p030c9.f;
import p051e9.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_QuranAccessoryView extends View implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f13829r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13830s;

    @Override // p051e9.b
    public final Object c() {
        if (this.f13829r == null) {
            this.f13829r = new f(this);
        }
        return this.f13829r.c();
    }
}
