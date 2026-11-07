package com.ayah.dao.backup;

import V8.b;
import V8.d;
import com.google.android.gms.internal.measurement.B1;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.m;
import com.squareup.moshi.n;
import com.squareup.moshi.s;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import p120l9.t;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class BackupDataJsonAdapter extends JsonAdapter<BackupData> {
    public static final int $stable = 8;
    private volatile Constructor<BackupData> constructorRef;
    private final JsonAdapter<List<Favorite>> listOfFavoriteAdapter;
    private final JsonAdapter<List<Note>> listOfNoteAdapter;
    private final m options;

    public BackupDataJsonAdapter(C c10) {
        j.e(c10, "moshi");
        this.options = m.a("favorites", "notes");
        b bVarG = B1.G(Favorite.class);
        t tVar = t.f19442r;
        this.listOfFavoriteAdapter = c10.b(bVarG, tVar, "favorites");
        this.listOfNoteAdapter = c10.b(B1.G(Note.class), tVar, "notes");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        j.e(nVar, "reader");
        nVar.e();
        List list = null;
        List list2 = null;
        int i10 = -1;
        while (nVar.w()) {
            int iV = nVar.V(this.options);
            if (iV == -1) {
                nVar.b0();
                nVar.c0();
            } else if (iV == 0) {
                list = (List) this.listOfFavoriteAdapter.a(nVar);
                if (list == null) {
                    throw d.j("favorites", "favorites", nVar);
                }
                i10 &= -2;
            } else if (iV == 1) {
                list2 = (List) this.listOfNoteAdapter.a(nVar);
                if (list2 == null) {
                    throw d.j("notes", "notes", nVar);
                }
                i10 &= -3;
            } else {
                continue;
            }
        }
        nVar.n();
        if (i10 == -4) {
            j.c(list, "null cannot be cast to non-null type kotlin.collections.List<com.ayah.dao.backup.Favorite>");
            j.c(list2, "null cannot be cast to non-null type kotlin.collections.List<com.ayah.dao.backup.Note>");
            return new BackupData(list, list2);
        }
        Constructor<BackupData> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = BackupData.class.getDeclaredConstructor(List.class, List.class, Integer.TYPE, d.f8427c);
            this.constructorRef = declaredConstructor;
            j.d(declaredConstructor, "also(...)");
        }
        BackupData backupDataNewInstance = declaredConstructor.newInstance(list, list2, Integer.valueOf(i10), null);
        j.d(backupDataNewInstance, "newInstance(...)");
        return backupDataNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        BackupData backupData = (BackupData) obj;
        j.e(sVar, "writer");
        if (backupData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        sVar.e();
        sVar.w("favorites");
        this.listOfFavoriteAdapter.e(sVar, backupData.f13730a);
        sVar.w("notes");
        this.listOfNoteAdapter.e(sVar, backupData.f13731b);
        sVar.i();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(BackupData)");
        return sb.toString();
    }
}
