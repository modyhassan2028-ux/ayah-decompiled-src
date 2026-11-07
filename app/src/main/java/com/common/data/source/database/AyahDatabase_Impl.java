package com.ayah.common.data.source.database;

import A3.g;
import A3.h;
import B3.b;
import E2.W;
import F2.C0162g;
import com.ayah.common.data.source.database.AyahDatabase_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p110k9.a;
import p110k9.o;
import p120l9.r;
import p251z9.e;
import p251z9.w;

/* JADX INFO: loaded from: classes.dex */
public final class AyahDatabase_Impl extends AyahDatabase {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f13673l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o f13674m;

    public AyahDatabase_Impl() {
        final int i10 = 0;
        this.f13673l = a.d(new p241y9.a(this) { // from class: B3.a

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ AyahDatabase_Impl f597s;

            {
                this.f597s = this;
            }

            @Override // p241y9.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return new h(this.f597s);
                    default:
                        return new g(this.f597s);
                }
            }
        });
        final int i11 = 1;
        this.f13674m = a.d(new p241y9.a(this) { // from class: B3.a

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ AyahDatabase_Impl f597s;

            {
                this.f597s = this;
            }

            @Override // p241y9.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return new h(this.f597s);
                    default:
                        return new g(this.f597s);
                }
            }
        });
    }

    @Override // F2.u
    public final List a(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // F2.u
    public final C0162g b() {
        return new C0162g(this, new LinkedHashMap(), new LinkedHashMap(), "favorites", "notes");
    }

    @Override // F2.u
    public final W c() {
        return new b(this);
    }

    @Override // F2.u
    public final Set e() {
        return new LinkedHashSet();
    }

    @Override // F2.u
    public final LinkedHashMap f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e eVarA = w.a(h.class);
        r rVar = r.f19440r;
        linkedHashMap.put(eVarA, rVar);
        linkedHashMap.put(w.a(g.class), rVar);
        return linkedHashMap;
    }

    @Override // com.ayah.common.data.source.database.AyahDatabase
    public final g l() {
        return (g) this.f13674m.getValue();
    }

    @Override // com.ayah.common.data.source.database.AyahDatabase
    public final h m() {
        return (h) this.f13673l.getValue();
    }
}
