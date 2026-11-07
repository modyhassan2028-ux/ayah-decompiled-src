package com.ayah.feature.tafsir.view;

import android.widget.FrameLayout;
import p030c9.f;
import p051e9.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_TafsirPage extends FrameLayout implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f13875r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13876s;

    @Override // p051e9.b
    public final Object c() {
        if (this.f13875r == null) {
            this.f13875r = new f(this);
        }
        return this.f13875r.c();
    }
}
