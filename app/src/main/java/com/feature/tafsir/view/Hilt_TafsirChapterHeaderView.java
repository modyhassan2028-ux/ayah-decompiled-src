package com.ayah.feature.tafsir.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import p030c9.f;
import p035d3.v;
import p037d6.a;
import p051e9.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_TafsirChapterHeaderView extends AppCompatImageView implements b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public f f13873u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f13874v;

    public Hilt_TafsirChapterHeaderView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        if (isInEditMode() || this.f13874v) {
            return;
        }
        this.f13874v = true;
        ((TafsirChapterHeaderView) this).f13884H = (p089i4.b) ((v) ((a) c())).f15685c.f15622f.get();
    }

    @Override // p051e9.b
    public final Object c() {
        if (this.f13873u == null) {
            this.f13873u = new f(this);
        }
        return this.f13873u.c();
    }
}
