package com.ayah.common.data.dao.notification;

import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.adapters.b;
import com.squareup.moshi.n;
import com.squareup.moshi.s;
import com.squareup.moshi.z;
import dev.zacsweers.moshix.sealed.runtime.internal.ObjectJsonAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k3.c;
import k3.d;
import k3.e;
import p120l9.t;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class ReminderDestinationJsonAdapter extends JsonAdapter<ReminderDestination> {
    private final JsonAdapter<ReminderDestination> runtimeAdapter;

    public ReminderDestinationJsonAdapter(C c10) {
        j.e(c10, "moshi");
        List list = c10.f15414a;
        int i10 = 0;
        z zVar = new z(0);
        int i11 = c10.f15415b;
        while (true) {
            ArrayList arrayList = zVar.f15517a;
            if (i10 >= i11) {
                int size = list.size() - C.f15413e.size();
                while (i11 < size) {
                    com.squareup.moshi.j jVar = (com.squareup.moshi.j) list.get(i11);
                    if (jVar == null) {
                        throw new IllegalArgumentException("factory == null");
                    }
                    arrayList.add(jVar);
                    i11++;
                }
                zVar.a(c.class, new ObjectJsonAdapter(c.f18970a));
                zVar.a(e.class, new ObjectJsonAdapter(e.f18972a));
                C c11 = new C(zVar);
                List list2 = Collections.EMPTY_LIST;
                if (list2.contains("bookmark")) {
                    throw new IllegalArgumentException("Labels must be unique.");
                }
                ArrayList arrayList2 = new ArrayList(list2);
                arrayList2.add("bookmark");
                ArrayList arrayList3 = new ArrayList(list2);
                arrayList3.add(ReminderDestination.Bookmark.class);
                if (arrayList2.contains("khatmah")) {
                    throw new IllegalArgumentException("Labels must be unique.");
                }
                ArrayList arrayList4 = new ArrayList(arrayList2);
                arrayList4.add("khatmah");
                ArrayList arrayList5 = new ArrayList(arrayList3);
                arrayList5.add(c.class);
                com.squareup.moshi.adapters.c cVarB = new com.squareup.moshi.adapters.c(arrayList4, arrayList5, null).b(ReminderDestination.Sura.class, "sura").b(e.class, "today");
                JsonAdapter<ReminderDestination> jsonAdapterA = new com.squareup.moshi.adapters.c(cVarB.f15431a, cVarB.f15432b, new b(cVarB, d.f18971a)).a(ReminderDestination.class, t.f19442r, c11);
                j.c(jsonAdapterA, "null cannot be cast to non-null type com.squareup.moshi.JsonAdapter<com.ayah.common.data.dao.notification.ReminderDestination>");
                this.runtimeAdapter = jsonAdapterA;
                return;
            }
            com.squareup.moshi.j jVar2 = (com.squareup.moshi.j) list.get(i10);
            if (jVar2 == null) {
                throw new IllegalArgumentException("factory == null");
            }
            int i12 = zVar.f15518b;
            zVar.f15518b = i12 + 1;
            arrayList.add(i12, jVar2);
            i10++;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) {
        j.e(nVar, "reader");
        return (ReminderDestination) this.runtimeAdapter.a(nVar);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        j.e(sVar, "writer");
        this.runtimeAdapter.e(sVar, (ReminderDestination) obj);
    }
}
