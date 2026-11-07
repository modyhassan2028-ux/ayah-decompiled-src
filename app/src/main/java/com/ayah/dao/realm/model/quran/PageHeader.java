package com.ayah.dao.realm.model.quran;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.com_ayah_dao_realm_model_quran_PageHeaderRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class PageHeader extends RealmObject implements com_ayah_dao_realm_model_quran_PageHeaderRealmProxyInterface {
    private RealmList<Chapter> chapters;
    private Part part;
    private Quarter quarter;

    /* JADX WARN: Multi-variable type inference failed */
    public PageHeader() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$chapters(new RealmList());
    }

    public final RealmList<Chapter> getChapters() {
        return realmGet$chapters();
    }

    public final Part getPart() {
        return realmGet$part();
    }

    public final Quarter getQuarter() {
        return realmGet$quarter();
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageHeaderRealmProxyInterface
    public RealmList realmGet$chapters() {
        return this.chapters;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageHeaderRealmProxyInterface
    public Part realmGet$part() {
        return this.part;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageHeaderRealmProxyInterface
    public Quarter realmGet$quarter() {
        return this.quarter;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageHeaderRealmProxyInterface
    public void realmSet$chapters(RealmList realmList) {
        this.chapters = realmList;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageHeaderRealmProxyInterface
    public void realmSet$part(Part part) {
        this.part = part;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageHeaderRealmProxyInterface
    public void realmSet$quarter(Quarter quarter) {
        this.quarter = quarter;
    }

    public final void setChapters(RealmList<Chapter> realmList) {
        j.e(realmList, "<set-?>");
        realmSet$chapters(realmList);
    }

    public final void setPart(Part part) {
        realmSet$part(part);
    }

    public final void setQuarter(Quarter quarter) {
        realmSet$quarter(quarter);
    }
}
