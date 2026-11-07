package com.ayah.dao.realm.model.audio;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;
import io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class Reciter extends RealmObject implements com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface {
    private String arInfo;

    @Index
    private String arSubtitle;

    @Index
    private String arTitle;

    @Index
    private String category;
    private String enInfo;

    @Index
    private String enSubtitle;

    @Index
    private String enTitle;

    @Index
    private boolean isPrivate;

    @PrimaryKey
    private String reciterID;

    @Index
    private String searchableText;
    private RealmList<Track> tracks;

    /* JADX WARN: Multi-variable type inference failed */
    public Reciter() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$reciterID("");
        realmSet$category("");
        realmSet$arTitle("");
        realmSet$enTitle("");
        realmSet$searchableText("");
        realmSet$tracks(new RealmList());
    }

    public final String getArInfo() {
        return realmGet$arInfo();
    }

    public final String getArSubtitle() {
        return realmGet$arSubtitle();
    }

    public final String getArTitle() {
        return realmGet$arTitle();
    }

    public final String getCategory() {
        return realmGet$category();
    }

    public final String getEnInfo() {
        return realmGet$enInfo();
    }

    public final String getEnSubtitle() {
        return realmGet$enSubtitle();
    }

    public final String getEnTitle() {
        return realmGet$enTitle();
    }

    public final String getReciterID() {
        return realmGet$reciterID();
    }

    public final String getSearchableText() {
        return realmGet$searchableText();
    }

    public final RealmList<Track> getTracks() {
        return realmGet$tracks();
    }

    public final boolean isPrivate() {
        return realmGet$isPrivate();
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public String realmGet$arInfo() {
        return this.arInfo;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public String realmGet$arSubtitle() {
        return this.arSubtitle;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public String realmGet$arTitle() {
        return this.arTitle;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public String realmGet$category() {
        return this.category;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public String realmGet$enInfo() {
        return this.enInfo;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public String realmGet$enSubtitle() {
        return this.enSubtitle;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public String realmGet$enTitle() {
        return this.enTitle;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public boolean realmGet$isPrivate() {
        return this.isPrivate;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public String realmGet$reciterID() {
        return this.reciterID;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public String realmGet$searchableText() {
        return this.searchableText;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public RealmList realmGet$tracks() {
        return this.tracks;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$arInfo(String str) {
        this.arInfo = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$arSubtitle(String str) {
        this.arSubtitle = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$arTitle(String str) {
        this.arTitle = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$category(String str) {
        this.category = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$enInfo(String str) {
        this.enInfo = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$enSubtitle(String str) {
        this.enSubtitle = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$enTitle(String str) {
        this.enTitle = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$isPrivate(boolean z10) {
        this.isPrivate = z10;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$reciterID(String str) {
        this.reciterID = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$searchableText(String str) {
        this.searchableText = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_audio_ReciterRealmProxyInterface
    public void realmSet$tracks(RealmList realmList) {
        this.tracks = realmList;
    }

    public final void setArInfo(String str) {
        realmSet$arInfo(str);
    }

    public final void setArSubtitle(String str) {
        realmSet$arSubtitle(str);
    }

    public final void setArTitle(String str) {
        j.e(str, "<set-?>");
        realmSet$arTitle(str);
    }

    public final void setCategory(String str) {
        j.e(str, "<set-?>");
        realmSet$category(str);
    }

    public final void setEnInfo(String str) {
        realmSet$enInfo(str);
    }

    public final void setEnSubtitle(String str) {
        realmSet$enSubtitle(str);
    }

    public final void setEnTitle(String str) {
        j.e(str, "<set-?>");
        realmSet$enTitle(str);
    }

    public final void setPrivate(boolean z10) {
        realmSet$isPrivate(z10);
    }

    public final void setReciterID(String str) {
        j.e(str, "<set-?>");
        realmSet$reciterID(str);
    }

    public final void setSearchableText(String str) {
        j.e(str, "<set-?>");
        realmSet$searchableText(str);
    }

    public final void setTracks(RealmList<Track> realmList) {
        j.e(realmList, "<set-?>");
        realmSet$tracks(realmList);
    }
}
