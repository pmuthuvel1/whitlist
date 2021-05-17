/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.whitelist.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Muthuvel P <pmuthuvel@gmail.com>
 */
@Entity
@Table(name = "tbl_mobile_whitelist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblMobileWhitelist.findAll", query = "SELECT t FROM TblMobileWhitelist t")
    , @NamedQuery(name = "TblMobileWhitelist.findByMobileId", query = "SELECT t FROM TblMobileWhitelist t WHERE t.mobileId = :mobileId")
    , @NamedQuery(name = "TblMobileWhitelist.findByMsisdn", query = "SELECT t FROM TblMobileWhitelist t WHERE t.msisdn = :msisdn")
    , @NamedQuery(name = "TblMobileWhitelist.findByImsi", query = "SELECT t FROM TblMobileWhitelist t WHERE t.imsi = :imsi")
    , @NamedQuery(name = "TblMobileWhitelist.findByCreatedOn", query = "SELECT t FROM TblMobileWhitelist t WHERE t.createdOn = :createdOn")
    , @NamedQuery(name = "TblMobileWhitelist.findByCreatedBy", query = "SELECT t FROM TblMobileWhitelist t WHERE t.createdBy = :createdBy")
    , @NamedQuery(name = "TblMobileWhitelist.findByUpdatedOn", query = "SELECT t FROM TblMobileWhitelist t WHERE t.updatedOn = :updatedOn")
    , @NamedQuery(name = "TblMobileWhitelist.findByUpdatedBy", query = "SELECT t FROM TblMobileWhitelist t WHERE t.updatedBy = :updatedBy")
    , @NamedQuery(name = "TblMobileWhitelist.findByDeletionStatus", query = "SELECT t FROM TblMobileWhitelist t WHERE t.deletionStatus = :deletionStatus")})
public class TblMobileWhitelist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mobile_id")
    private Integer mobileId;
    @Basic(optional = false)
    @Column(name = "msisdn")
    private String msisdn;
    @Column(name = "imsi")
    private String imsi;
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "updated_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "deletion_status")
    private Character deletionStatus;

    public TblMobileWhitelist() {
    }

    public TblMobileWhitelist(Integer mobileId) {
        this.mobileId = mobileId;
    }

    public TblMobileWhitelist(Integer mobileId, String msisdn) {
        this.mobileId = mobileId;
        this.msisdn = msisdn;
    }

    public Integer getMobileId() {
        return mobileId;
    }

    public void setMobileId(Integer mobileId) {
        this.mobileId = mobileId;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Character getDeletionStatus() {
        return deletionStatus;
    }

    public void setDeletionStatus(Character deletionStatus) {
        this.deletionStatus = deletionStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mobileId != null ? mobileId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblMobileWhitelist)) {
            return false;
        }
        TblMobileWhitelist other = (TblMobileWhitelist) object;
        if ((this.mobileId == null && other.mobileId != null) || (this.mobileId != null && !this.mobileId.equals(other.mobileId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.whitelist.models.TblMobileWhitelist[ mobileId=" + mobileId + " ]";
    }
    
}
