package com.ayah.common.data.source.database;

import A3.c;
import B3.b;
import B3.f;
import E2.W;
import F2.C0162g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p110k9.a;
import p110k9.o;
import p120l9.r;
import p251z9.w;

/* JADX INFO: loaded from: classes.dex */
public final class BookDatabase_Impl extends BookDatabase {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f13675l = a.d(new f(0, this));

    @Override // F2.u
    public final List a(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // F2.u
    public final C0162g b() {
        return new C0162g(this, new LinkedHashMap(), new LinkedHashMap(), "bookEntry");
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
        linkedHashMap.put(w.a(c.class), r.f19440r);
        return linkedHashMap;
    }

    @Override // com.ayah.common.data.source.database.BookDatabase
    public final c l() {
        return (c) this.f13675l.getValue();
    }
}
