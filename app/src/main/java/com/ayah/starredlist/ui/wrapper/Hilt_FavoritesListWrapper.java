package com.ayah.feature.starredlist.ui.wrapper;

import android.widget.FrameLayout;
import p030c9.f;
import p051e9.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_FavoritesListWrapper extends FrameLayout implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f13871r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13872s;

    @Override // p051e9.b
    public final Object c() {
        if (this.f13871r == null) {
            this.f13871r = new f(this);
        }
        return this.f13871r.c();
    }
}
