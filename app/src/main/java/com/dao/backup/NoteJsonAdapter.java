package com.ayah.dao.backup;

import V8.d;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.m;
import com.squareup.moshi.n;
import com.squareup.moshi.s;
import p120l9.t;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class NoteJsonAdapter extends JsonAdapter<Note> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> intAdapter;
    private final m options;
    private final JsonAdapter<String> stringAdapter;

    public NoteJsonAdapter(C c10) {
        j.e(c10, "moshi");
        this.options = m.a("index", "text");
        Class cls = Integer.TYPE;
        t tVar = t.f19442r;
        this.intAdapter = c10.b(cls, tVar, "index");
        this.stringAdapter = c10.b(String.class, tVar, "text");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) {
        j.e(nVar, "reader");
        nVar.e();
        Integer num = null;
        String str = null;
        while (nVar.w()) {
            int iV = nVar.V(this.options);
            if (iV == -1) {
                nVar.b0();
                nVar.c0();
            } else if (iV == 0) {
                num = (Integer) this.intAdapter.a(nVar);
                if (num == null) {
                    throw d.j("index", "index", nVar);
                }
            } else if (iV == 1 && (str = (String) this.stringAdapter.a(nVar)) == null) {
                throw d.j("text", "text", nVar);
            }
        }
        nVar.n();
        if (num == null) {
            throw d.e("index", "index", nVar);
        }
        int iIntValue = num.intValue();
        if (str != null) {
            return new Note(iIntValue, str);
        }
        throw d.e("text", "text", nVar);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        Note note = (Note) obj;
        j.e(sVar, "writer");
        if (note == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        sVar.e();
        sVar.w("index");
        this.intAdapter.e(sVar, Integer.valueOf(note.f13733a));
        sVar.w("text");
        this.stringAdapter.e(sVar, note.f13734b);
        sVar.i();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(26);
        sb.append("GeneratedJsonAdapter(Note)");
        return sb.toString();
    }
}
