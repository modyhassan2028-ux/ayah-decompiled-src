package com.ayah.feature.audio.service;

import E6.k;
import J0.C0280d0;
import android.app.Service;
import i7.D;
import p030c9.i;
import p035d3.p;
import p035d3.r;
import p035d3.s;
import p035d3.u;
import p051e9.b;
import p144o3.h;
import p155p3.a;
import p175r4.f;
import p190t4.e;
import p237y4.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_AyahAudioService extends Service implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile i f13756r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f13757s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13758t = false;

    @Override // p051e9.b
    public final Object c() {
        if (this.f13756r == null) {
            synchronized (this.f13757s) {
                try {
                    if (this.f13756r == null) {
                        this.f13756r = new i(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f13756r.c();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (!this.f13758t) {
            this.f13758t = true;
            AyahAudioService ayahAudioService = (AyahAudioService) this;
            r rVar = (r) ((f) c());
            u uVar = rVar.f15638a;
            k kVar = uVar.f15659a;
            ayahAudioService.f13740E = new e(kVar.f1940a, (h) uVar.f15675s.get(), (a) uVar.f15651J.get());
            ayahAudioService.f13741F = (a) uVar.f15651J.get();
            ayahAudioService.f13742G = (p144o3.a) uVar.f15647F.get();
            ayahAudioService.f13743H = uVar.c();
            ayahAudioService.f13744I = new C0280d0(kVar.f1940a, (c) uVar.S.get(), (p237y4.e) uVar.T.get(), (p144o3.b) uVar.f15653L.get());
            ayahAudioService.f13745J = (p) rVar.f15639b.get();
            ayahAudioService.f13746K = (s) uVar.f15658V.get();
            ayahAudioService.f13747L = new D(18);
            ayahAudioService.f13748M = (p166q4.a) uVar.f15668l.get();
        }
        super.onCreate();
    }
}
