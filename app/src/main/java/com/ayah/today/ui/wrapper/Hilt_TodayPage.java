package com.ayah.feature.today.ui.wrapper;

import android.widget.FrameLayout;
import p030c9.f;
import p051e9.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_TodayPage extends FrameLayout implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f13900r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13901s;

    @Override // p051e9.b
    public final Object c() {
        if (this.f13900r == null) {
            this.f13900r = new f(this);
        }
        return this.f13900r.c();
    }
}
