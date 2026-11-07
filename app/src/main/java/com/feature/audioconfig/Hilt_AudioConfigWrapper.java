package com.ayah.feature.audioconfig;

import android.widget.FrameLayout;
import p030c9.f;
import p051e9.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_AudioConfigWrapper extends FrameLayout implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f13761r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13762s;

    @Override // p051e9.b
    public final Object c() {
        if (this.f13761r == null) {
            this.f13761r = new f(this);
        }
        return this.f13761r.c();
    }
}
