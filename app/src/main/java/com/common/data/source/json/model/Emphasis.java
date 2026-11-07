package com.ayah.common.data.source.json.model;

import F9.h;
import F9.i;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.k;
import com.squareup.moshi.z;
import java.util.Collections;
import java.util.List;
import p251z9.A;
import p251z9.e;
import p251z9.w;
import p251z9.x;

/* JADX INFO: loaded from: classes.dex */
@k(generateAdapter = true)
public final class Emphasis {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final JsonAdapter f13678c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13680b;

    static {
        C c10 = new C(new z(0));
        int i10 = h.f2540c;
        h hVar = new h(i.f2543r, w.b(Emphasis.class));
        x xVar = w.f24887a;
        e eVarA = w.a(List.class);
        List listSingletonList = Collections.singletonList(hVar);
        xVar.getClass();
        f13678c = AbstractC0813f2.l(c10, new A(eVarA, listSingletonList));
    }

    public Emphasis(int i10, int i11) {
        this.f13679a = i10;
        this.f13680b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Emphasis)) {
            return false;
        }
        Emphasis emphasis = (Emphasis) obj;
        return this.f13679a == emphasis.f13679a && this.f13680b == emphasis.f13680b;
    }

    public final int hashCode() {
        return (this.f13679a * 31) + this.f13680b;
    }

    public final String toString() {
        return "Emphasis(location=" + this.f13679a + ", length=" + this.f13680b + ")";
    }
}
