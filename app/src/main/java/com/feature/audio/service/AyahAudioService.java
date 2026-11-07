package com.ayah.feature.audio.service;

import E2.C0112b;
import J0.C0280d0;
import K9.AbstractC0405x;
import N9.AbstractC0419l;
import N9.C0424q;
import N9.k0;
import O.H;
import P9.d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.i;
import android.support.v4.media.session.m;
import android.support.v4.media.session.t;
import android.util.Log;
import androidx.media.session.MediaButtonReceiver;
import com.ayah.MainActivity;
import i7.D;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executors;
import ka.r;
import p035d3.p;
import p035d3.q;
import p035d3.s;
import p035d3.u;
import p065g3.b;
import p150o9.c;
import p181s2.o;
import p190t4.e;
import p209v4.a;
import p219w4.f;
import p251z9.j;
import u.C1350e;
import z3.k;

/* JADX INFO: loaded from: classes.dex */
public final class AyahAudioService extends Hilt_AyahAudioService {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static boolean f13735O;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public i f13736A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public a f13737B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public f f13738C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f13739D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public e f13740E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public p155p3.a f13741F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public p144o3.a f13742G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public r f13743H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public C0280d0 f13744I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public p f13745J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public s f13746K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public D f13747L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public p166q4.a f13748M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final d f13749N = AbstractC0405x.d();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13750u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public WifiManager.WifiLock f13751v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile String f13752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0112b f13753x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public android.support.v4.media.session.r f13754y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Looper f13755z;

    public static final void a(AyahAudioService ayahAudioService, boolean z10) {
        try {
            f fVar = ayahAudioService.f13738C;
            c cVar = null;
            if (fVar == null) {
                j.k("audioPlayer");
                throw null;
            }
            fVar.c(false);
            AbstractC0405x.x(ayahAudioService.f13749N, null, new H(ayahAudioService, z10, cVar, 1), 3);
        } catch (IOException e10) {
            Ha.a.f3643a.getClass();
            R7.f.l(new Object[0]);
            e10.printStackTrace();
        }
    }

    public final C0280d0 b() {
        C0280d0 c0280d0 = this.f13744I;
        if (c0280d0 != null) {
            return c0280d0;
        }
        j.k("audioPresenter");
        throw null;
    }

    public final void d() {
        if (this.f13752w != null) {
            C0112b c0112b = this.f13753x;
            if (c0112b == null) {
                j.k("downloadManager");
                throw null;
            }
            c0112b.c(this.f13752w);
            this.f13752w = null;
        }
        k(1);
        m(0);
        i();
        f13735O = false;
        android.support.v4.media.session.r rVar = this.f13754y;
        if (rVar == null) {
            j.k("mediaSession");
            throw null;
        }
        ((m) rVar.f11364s).f11353a.setActive(false);
        Iterator it = ((ArrayList) rVar.f11366u).iterator();
        if (it.hasNext()) {
            throw p245z2.a.z(it);
        }
    }

    public final void e(boolean z10) {
        if (((k0) b().g).getValue() != null) {
            if (!z10) {
                f fVar = this.f13738C;
                if (fVar == null) {
                    j.k("audioPlayer");
                    throw null;
                }
                if (fVar.d()) {
                    return;
                }
            }
            b().j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void f() {
        C0280d0 c0280d0B = b();
        f fVar = this.f13738C;
        if (fVar == null) {
            j.k("audioPlayer");
            throw null;
        }
        int iB = fVar.b();
        k0 k0Var = (k0) c0280d0B.f4066e;
        k0 k0Var2 = (k0) c0280d0B.g;
        p065g3.c cVarC = c0280d0B.c();
        ?? r10 = cVarC != null ? cVarC.g : 0;
        p246z4.a aVar = (p246z4.a) k0Var2.getValue();
        p175r4.a aVar2 = (p175r4.a) ((k0) c0280d0B.f4067f).getValue();
        if (r10 == 0 || aVar == null) {
            return;
        }
        k kVar = aVar.f24806a;
        if (aVar2 != null) {
            k kVar2 = aVar2.f21553r;
            Integer num = (Integer) ((p237y4.c) c0280d0B.f4064c).f24640c.get(Integer.valueOf(kVar.f24796r - 1));
            int iIntValue = num != null ? num.intValue() : 0;
            int i10 = kVar.f24796r;
            int i11 = kVar.f24797s - 1;
            int i12 = kVar.f24798t - 1;
            k kVar3 = new k(i10, i11, i12);
            if (i11 < 1) {
                int i13 = i10 - 1;
                if (i13 < 1) {
                    kVar3 = kVar;
                } else {
                    kVar3 = new k(i13, iIntValue, i12);
                }
            }
            float f3 = 1000;
            int i14 = (int) (((b) r10.get(i11)).f16283b * f3);
            if (kVar.equals(kVar2) || iB - i14 > 3000) {
                p246z4.c cVar = new p246z4.c(System.currentTimeMillis(), i14);
                k0Var.getClass();
                k0Var.n(null, cVar);
            } else if (kVar3.compareTo(kVar2) >= 0) {
                if (kVar3.f24796r == i10) {
                    k0Var2.n(null, p246z4.a.a(aVar, kVar3, 0, 0, 10));
                    p246z4.c cVar2 = new p246z4.c(System.currentTimeMillis(), (int) (((b) r10.get(kVar3.f24797s - 1)).f16283b * f3));
                    k0Var.getClass();
                    k0Var.n(null, cVar2);
                    return;
                }
                k0Var2.n(null, p246z4.a.a(aVar, kVar3, 0, 0, 10));
                p246z4.b bVar = new p246z4.b(System.currentTimeMillis(), false);
                k0Var.getClass();
                k0Var.n(null, bVar);
            }
        }
    }

    public final void g() {
        C0280d0 c0280d0B = b();
        k0 k0Var = (k0) c0280d0B.f4066e;
        int iH = c0280d0B.h();
        k0 k0Var2 = (k0) c0280d0B.g;
        p246z4.a aVar = (p246z4.a) k0Var2.getValue();
        p175r4.a aVar2 = (p175r4.a) ((k0) c0280d0B.f4067f).getValue();
        p124m3.j jVarE = c0280d0B.e();
        if (iH <= 0 || aVar == null) {
            return;
        }
        k kVar = aVar.f24806a;
        if (aVar2 == null || jVarE == null) {
            return;
        }
        k kVarF = o.f(kVar, jVarE.f19596n.f19537m);
        if (kVarF.compareTo(aVar2.f21554s) > 0 || kVar.equals(kVarF)) {
            return;
        }
        k0Var2.n(null, p246z4.a.a(aVar, kVarF, 0, 0, 10));
        if (kVarF.f24796r != kVar.f24796r) {
            p246z4.b bVar = new p246z4.b(System.currentTimeMillis(), false);
            k0Var.getClass();
            k0Var.n(null, bVar);
        } else {
            p246z4.d dVar = new p246z4.d(System.currentTimeMillis(), iH);
            k0Var.getClass();
            k0Var.n(null, dVar);
        }
    }

    public final void h() {
        f fVar = this.f13738C;
        if (fVar == null) {
            j.k("audioPlayer");
            throw null;
        }
        fVar.e();
        AbstractC0405x.h((d) b().f4068h, null);
        stopSelf();
    }

    public final void i() {
        WifiManager.WifiLock wifiLock = this.f13751v;
        if (wifiLock == null) {
            j.k("wifiLock");
            throw null;
        }
        if (wifiLock.isHeld()) {
            wifiLock.release();
        }
    }

    public final void j() {
        int iH = b().h();
        if (iH > 0) {
            f fVar = this.f13738C;
            if (fVar == null) {
                j.k("audioPlayer");
                throw null;
            }
            int i10 = B9.a.i(iH - fVar.b(), 100, 5000);
            R7.f fVar2 = Ha.a.f3643a;
            Object[] objArr = {Integer.valueOf(i10)};
            fVar2.getClass();
            R7.f.h(objArr);
            i iVar = this.f13736A;
            if (iVar != null) {
                iVar.sendEmptyMessageDelayed(2, i10);
            } else {
                j.k("serviceHandler");
                throw null;
            }
        }
    }

    public final void k(int i10) {
        long jB;
        if (i10 == 3) {
            f fVar = this.f13738C;
            if (fVar == null) {
                j.k("audioPlayer");
                throw null;
            }
            jB = fVar.b();
        } else {
            jB = 0;
        }
        ArrayList arrayList = new ArrayList();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        android.support.v4.media.session.r rVar = this.f13754y;
        if (rVar == null) {
            j.k("mediaSession");
            throw null;
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(i10, jB, 0L, 1.0f, 127L, 0, null, jElapsedRealtime, arrayList, -1L, null);
        m mVar = (m) rVar.f11364s;
        mVar.f11358f = playbackStateCompat;
        synchronized (mVar.f11356d) {
            for (int iBeginBroadcast = mVar.f11357e.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((android.support.v4.media.session.b) mVar.f11357e.getBroadcastItem(iBeginBroadcast)).z0(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            mVar.f11357e.finishBroadcast();
        }
        MediaSession mediaSession = mVar.f11353a;
        if (playbackStateCompat.f11322C == null) {
            PlaybackState.Builder builderD = android.support.v4.media.session.s.d();
            android.support.v4.media.session.s.x(builderD, playbackStateCompat.f11323r, playbackStateCompat.f11324s, playbackStateCompat.f11326u, playbackStateCompat.f11330y);
            android.support.v4.media.session.s.u(builderD, playbackStateCompat.f11325t);
            android.support.v4.media.session.s.s(builderD, playbackStateCompat.f11327v);
            android.support.v4.media.session.s.v(builderD, playbackStateCompat.f11329x);
            ArrayList arrayList2 = playbackStateCompat.f11331z;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                PlaybackStateCompat.CustomAction customAction = (PlaybackStateCompat.CustomAction) obj;
                PlaybackState.CustomAction.Builder builderE = android.support.v4.media.session.s.e(customAction.f11332r, customAction.f11333s, customAction.f11334t);
                android.support.v4.media.session.s.w(builderE, customAction.f11335u);
                android.support.v4.media.session.s.a(builderD, android.support.v4.media.session.s.b(builderE));
            }
            android.support.v4.media.session.s.t(builderD, playbackStateCompat.f11320A);
            t.b(builderD, playbackStateCompat.f11321B);
            playbackStateCompat.f11322C = android.support.v4.media.session.s.c(builderD);
        }
        mediaSession.setPlaybackState(playbackStateCompat.f11322C);
    }

    public final void l(boolean z10) {
        String strD;
        a aVar = this.f13737B;
        if (aVar == null) {
            j.k("audioNotificationManager");
            throw null;
        }
        p124m3.j jVarE = b().e();
        if (jVarE == null || (strD = jVarE.d(this)) == null) {
            strD = "";
        }
        if (this.f13747L != null) {
            aVar.f23333d.notify(1, aVar.b(strD, z10, new Intent(this, (Class<?>) MainActivity.class), new Intent(this, (Class<?>) AyahAudioService.class)));
        } else {
            j.k("notificationNavigator");
            throw null;
        }
    }

    public final void m(int i10) {
        String strD;
        p124m3.j jVarE;
        p165q3.i iVar;
        this.f13750u = i10;
        if (i10 != 0) {
            l(i10 == 3);
        }
        Bundle bundle = new Bundle();
        p124m3.j jVarE2 = b().e();
        if (jVarE2 == null || (strD = jVarE2.d(this)) == null) {
            strD = "";
        }
        C1350e c1350e = MediaMetadataCompat.f11290t;
        if (c1350e.containsKey("android.media.metadata.TITLE") && ((Integer) c1350e.get("android.media.metadata.TITLE")).intValue() != 1) {
            throw new IllegalArgumentException("The android.media.metadata.TITLE key cannot be used to put a String");
        }
        bundle.putCharSequence("android.media.metadata.TITLE", strD);
        if (i10 != 0 && i10 != 1) {
            f fVar = this.f13738C;
            if (fVar == null) {
                j.k("audioPlayer");
                throw null;
            }
            long jB = fVar.b();
            if (c1350e.containsKey("android.media.metadata.DURATION") && ((Integer) c1350e.get("android.media.metadata.DURATION")).intValue() != 0) {
                throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
            }
            bundle.putLong("android.media.metadata.DURATION", jB);
        }
        a aVar = this.f13737B;
        if (aVar == null) {
            j.k("audioNotificationManager");
            throw null;
        }
        s4.a aVarA = aVar.a();
        Bitmap bitmap = aVarA != null ? aVarA.f22131a : null;
        if (bitmap != null) {
            if (c1350e.containsKey("android.media.metadata.DISPLAY_ICON") && ((Integer) c1350e.get("android.media.metadata.DISPLAY_ICON")).intValue() != 2) {
                throw new IllegalArgumentException("The android.media.metadata.DISPLAY_ICON key cannot be used to put a Bitmap");
            }
            bundle.putParcelable("android.media.metadata.DISPLAY_ICON", bitmap);
        }
        android.support.v4.media.session.r rVar = this.f13754y;
        if (rVar == null) {
            j.k("mediaSession");
            throw null;
        }
        MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat(bundle);
        m mVar = (m) rVar.f11364s;
        mVar.g = mediaMetadataCompat;
        MediaSession mediaSession = mVar.f11353a;
        if (mediaMetadataCompat.f11292s == null) {
            Parcel parcelObtain = Parcel.obtain();
            mediaMetadataCompat.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            mediaMetadataCompat.f11292s = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        mediaSession.setMetadata(mediaMetadataCompat.f11292s);
        p175r4.a aVar2 = (p175r4.a) ((k0) b().f4067f).getValue();
        boolean z10 = i10 == 1 || i10 == 2 || i10 == 3;
        if (i10 == 0) {
            p144o3.a aVar3 = this.f13742G;
            if (aVar3 == null) {
                j.k("audioPlaybackModel");
                throw null;
            }
            k0 k0Var = aVar3.f20299a;
            k0Var.getClass();
            k0Var.n(null, p165q3.c.f21289a);
            return;
        }
        if (!z10 || aVar2 == null || (jVarE = b().e()) == null) {
            return;
        }
        if (i10 == 1) {
            iVar = p165q3.i.f21294r;
        } else if (i10 == 2) {
            iVar = p165q3.i.f21295s;
        } else {
            if (i10 != 3) {
                throw new IllegalStateException(p245z2.a.B(i10, "got an invalid type ", " for playback"));
            }
            iVar = p165q3.i.f21296t;
        }
        p165q3.i iVar2 = iVar;
        p144o3.a aVar4 = this.f13742G;
        if (aVar4 == null) {
            j.k("audioPlaybackModel");
            throw null;
        }
        p165q3.b bVar = new p165q3.b(aVar2.f21555t, jVarE.f19595m, jVarE.f19586b, jVarE.f19585a, jVarE.c(), iVar2, new p165q3.a(aVar2.f21553r, aVar2.f21554s, aVar2.f21556u, aVar2.f21557v));
        k0 k0Var2 = aVar4.f20299a;
        k0Var2.getClass();
        k0Var2.n(null, bVar);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        j.e(intent, "arg0");
        return null;
    }

    @Override // com.ayah.feature.audio.service.Hilt_AyahAudioService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        Ha.a.f3643a.getClass();
        R7.f.r(new Object[0]);
        p166q4.a aVar = this.f13748M;
        c cVar = null;
        if (aVar == null) {
            j.k("crashLogger");
            throw null;
        }
        aVar.a("AyahAudioService onCreate");
        HandlerThread handlerThread = new HandlerThread("AyahAudioService", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        j.d(looper, "getLooper(...)");
        this.f13755z = looper;
        Looper looper2 = this.f13755z;
        if (looper2 == null) {
            j.k("serviceLooper");
            throw null;
        }
        this.f13736A = new i(this, looper2);
        Context applicationContext = getApplicationContext();
        Object systemService = applicationContext.getSystemService("wifi");
        j.c(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) systemService).createWifiLock(1, "audiolock");
        j.d(wifiLockCreateWifiLock, "createWifiLock(...)");
        this.f13751v = wifiLockCreateWifiLock;
        Object systemService2 = getSystemService("audio");
        j.c(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
        android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(applicationContext, new ComponentName(this, (Class<?>) MediaButtonReceiver.class));
        this.f13754y = rVar;
        p175r4.c cVar2 = new p175r4.c(this);
        i iVar = this.f13736A;
        if (iVar == null) {
            j.k("serviceHandler");
            throw null;
        }
        ((m) rVar.f11364s).e(cVar2, iVar);
        p pVar = this.f13745J;
        if (pVar == null) {
            j.k("audioNotificationManagerFactory");
            throw null;
        }
        android.support.v4.media.session.r rVar2 = this.f13754y;
        if (rVar2 == null) {
            j.k("mediaSession");
            throw null;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = ((m) rVar2.f11364s).f11355c;
        j.d(mediaSessionCompat$Token, "getSessionToken(...)");
        q qVar = pVar.f15635a;
        this.f13737B = new a(qVar.f15636a.f15659a.f1940a, new E6.k(qVar.f15637b.f15638a.f15659a.f1940a), mediaSessionCompat$Token);
        s sVar = this.f13746K;
        if (sVar == null) {
            j.k("audioPlayerFactory");
            throw null;
        }
        i iVar2 = this.f13736A;
        if (iVar2 == null) {
            j.k("serviceHandler");
            throw null;
        }
        u uVar = (u) sVar.f15640a.f15616c;
        this.f13738C = new f(uVar.f15659a.f1940a, (p035d3.t) uVar.U.get(), iVar2);
        k(0);
        p052ea.a aVar2 = new p052ea.a();
        r rVar3 = this.f13743H;
        if (rVar3 == null) {
            j.k("okHttpClient");
            throw null;
        }
        aVar2.f15865d = rVar3;
        aVar2.f15863b.put("audio", Executors.newSingleThreadExecutor());
        aVar2.f15862a = 3;
        p052ea.a aVar3 = new p052ea.a(aVar2);
        p040da.b bVar = new p040da.b();
        D d5 = this.f13747L;
        if (d5 == null) {
            j.k("notificationNavigator");
            throw null;
        }
        p190t4.a aVar4 = new p190t4.a(applicationContext, d5);
        ArrayList arrayList = bVar.f15707a;
        arrayList.add(aVar4);
        e eVar = this.f13740E;
        if (eVar == null) {
            j.k("serviceAudioDownloadPropagator");
            throw null;
        }
        arrayList.add(eVar);
        this.f13753x = new C0112b(aVar3, bVar);
        C0424q c0424q = new C0424q(new C4.c((k0) b().f4066e, 11), new p175r4.e(this, cVar, 0), 2);
        d dVar = this.f13749N;
        AbstractC0419l.u(c0424q, dVar);
        p155p3.a aVar5 = this.f13741F;
        if (aVar5 == null) {
            j.k("downloadingPlaybackAudioModel");
            throw null;
        }
        AbstractC0419l.u(new C0424q(new C4.e(18, AbstractC0419l.n(aVar5.f20979b, 1)), new p175r4.e(this, cVar, 1), 2), dVar);
        f fVar = this.f13738C;
        if (fVar == null) {
            j.k("audioPlayer");
            throw null;
        }
        AbstractC0419l.u(new C0424q(fVar.f23722i, new p175r4.e(this, cVar, 2), 2), dVar);
        f fVar2 = this.f13738C;
        if (fVar2 != null) {
            AbstractC0419l.u(new C0424q(AbstractC0419l.n(fVar2.j, 1), new p175r4.e(this, cVar, 3), 2), dVar);
        } else {
            j.k("audioPlayer");
            throw null;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        f13735O = false;
        f fVar = this.f13738C;
        if (fVar == null) {
            j.k("audioPlayer");
            throw null;
        }
        fVar.e();
        d();
        Looper looper = this.f13755z;
        if (looper == null) {
            j.k("serviceLooper");
            throw null;
        }
        looper.quit();
        android.support.v4.media.session.r rVar = this.f13754y;
        if (rVar == null) {
            j.k("mediaSession");
            throw null;
        }
        m mVar = (m) rVar.f11364s;
        MediaSession mediaSession = mVar.f11353a;
        mVar.f11357e.kill();
        if (Build.VERSION.SDK_INT == 27) {
            try {
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e10) {
                Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e10);
            }
        }
        mediaSession.setCallback(null);
        mVar.f11354b.f11352f.set(null);
        mediaSession.release();
        AbstractC0405x.h(this.f13749N, null);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        String strD;
        j.e(intent, "intent");
        p166q4.a aVar = this.f13748M;
        if (aVar == null) {
            j.k("crashLogger");
            throw null;
        }
        aVar.a("AyahAudioService onStartCommand: " + intent.getAction());
        String action = intent.getAction();
        if ("com.ayah.action.STATUS".equals(action) || "com.ayah.action.PLAY".equals(action) || "android.intent.action.MEDIA_BUTTON".equals(action)) {
            a aVar2 = this.f13737B;
            if (aVar2 == null) {
                j.k("audioNotificationManager");
                throw null;
            }
            p124m3.j jVarE = b().e();
            if (jVarE == null || (strD = jVarE.d(this)) == null) {
                strD = "";
            }
            if (this.f13747L == null) {
                j.k("notificationNavigator");
                throw null;
            }
            startForeground(1, aVar2.b(strD, false, new Intent(this, (Class<?>) MainActivity.class), new Intent(this, (Class<?>) AyahAudioService.class)));
        }
        i iVar = this.f13736A;
        if (iVar == null) {
            j.k("serviceHandler");
            throw null;
        }
        Message messageObtainMessage = iVar.obtainMessage();
        messageObtainMessage.arg1 = i11;
        messageObtainMessage.obj = intent;
        messageObtainMessage.what = 1;
        i iVar2 = this.f13736A;
        if (iVar2 != null) {
            iVar2.sendMessage(messageObtainMessage);
            return 2;
        }
        j.k("serviceHandler");
        throw null;
    }
}
