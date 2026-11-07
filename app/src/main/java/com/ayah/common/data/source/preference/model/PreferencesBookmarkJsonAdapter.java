package com.ayah.common.data.source.preference.model;

import V8.d;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.m;
import com.squareup.moshi.n;
import com.squareup.moshi.s;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import p120l9.t;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesBookmarkJsonAdapter extends JsonAdapter<PreferencesBookmark> {
    private volatile Constructor<PreferencesBookmark> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final m options;
    private final JsonAdapter<String> stringAdapter;

    public PreferencesBookmarkJsonAdapter(C c10) {
        j.e(c10, "moshi");
        this.options = m.a("verseId", "name", "color", "timestampMillis");
        Class cls = Integer.TYPE;
        t tVar = t.f19442r;
        this.intAdapter = c10.b(cls, tVar, "verseId");
        this.stringAdapter = c10.b(String.class, tVar, "name");
        this.longAdapter = c10.b(Long.TYPE, tVar, "timestampMillis");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        j.e(nVar, "reader");
        Long l10 = 0L;
        nVar.e();
        int i10 = -1;
        Integer num = null;
        String str = null;
        String str2 = null;
        while (nVar.w()) {
            int iV = nVar.V(this.options);
            if (iV == -1) {
                nVar.b0();
                nVar.c0();
            } else if (iV == 0) {
                num = (Integer) this.intAdapter.a(nVar);
                if (num == null) {
                    throw d.j("verseId", "verseId", nVar);
                }
            } else if (iV == 1) {
                str = (String) this.stringAdapter.a(nVar);
                if (str == null) {
                    throw d.j("name", "name", nVar);
                }
            } else if (iV == 2) {
                str2 = (String) this.stringAdapter.a(nVar);
                if (str2 == null) {
                    throw d.j("color", "color", nVar);
                }
            } else if (iV == 3) {
                l10 = (Long) this.longAdapter.a(nVar);
                if (l10 == null) {
                    throw d.j("timestampMillis", "timestampMillis", nVar);
                }
                i10 = -9;
            } else {
                continue;
            }
        }
        nVar.n();
        if (i10 == -9) {
            if (num == null) {
                throw d.e("verseId", "verseId", nVar);
            }
            int iIntValue = num.intValue();
            if (str == null) {
                throw d.e("name", "name", nVar);
            }
            if (str2 != null) {
                return new PreferencesBookmark(iIntValue, l10.longValue(), str, str2);
            }
            throw d.e("color", "color", nVar);
        }
        Constructor<PreferencesBookmark> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = PreferencesBookmark.class.getDeclaredConstructor(cls, String.class, String.class, Long.TYPE, cls, d.f8427c);
            this.constructorRef = declaredConstructor;
            j.d(declaredConstructor, "also(...)");
        }
        if (num == null) {
            throw d.e("verseId", "verseId", nVar);
        }
        if (str == null) {
            throw d.e("name", "name", nVar);
        }
        if (str2 == null) {
            throw d.e("color", "color", nVar);
        }
        PreferencesBookmark preferencesBookmarkNewInstance = declaredConstructor.newInstance(num, str, str2, l10, Integer.valueOf(i10), null);
        j.d(preferencesBookmarkNewInstance, "newInstance(...)");
        return preferencesBookmarkNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        PreferencesBookmark preferencesBookmark = (PreferencesBookmark) obj;
        j.e(sVar, "writer");
        if (preferencesBookmark == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        sVar.e();
        sVar.w("verseId");
        this.intAdapter.e(sVar, Integer.valueOf(preferencesBookmark.f13695a));
        sVar.w("name");
        this.stringAdapter.e(sVar, preferencesBookmark.f13696b);
        sVar.w("color");
        this.stringAdapter.e(sVar, preferencesBookmark.f13697c);
        sVar.w("timestampMillis");
        this.longAdapter.e(sVar, Long.valueOf(preferencesBookmark.f13698d));
        sVar.i();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(PreferencesBookmark)");
        return sb.toString();
    }
}
