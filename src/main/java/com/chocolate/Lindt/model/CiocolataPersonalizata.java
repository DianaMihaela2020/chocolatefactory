package com.chocolate.Lindt.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CiocolataPersonalizata {
    @Id
    private int idCiocolataPersonalizata;
    private int idSortiment;
    private int idAroma;
    private int idAmbalaj;
    private int idCuloareAmbalaj;
    private int idAccesoriu;
    private int idCuloareText;

 public int getIdCiocolataPersonalizata() {
  return idCiocolataPersonalizata;
 }

 public void setIdCiocolataPersonalizata(int idCiocolataPersonalizata) {
  this.idCiocolataPersonalizata = idCiocolataPersonalizata;
 }

 public int getIdSortiment() {
  return idSortiment;
 }

 public void setIdSortiment(int idSortiment) {
  this.idSortiment = idSortiment;
 }

 public int getIdAroma() {
  return idAroma;
 }

 public void setIdAroma(int idAroma) {
  this.idAroma = idAroma;
 }

 public int getIdAmbalaj() {
  return idAmbalaj;
 }

 public void setIdAmbalaj(int idAmbalaj) {
  this.idAmbalaj = idAmbalaj;
 }

 public int getIdCuloareAmbalaj() {
  return idCuloareAmbalaj;
 }

 public void setIdCuloareAmbalaj(int idCuloareAmbalaj) {
  this.idCuloareAmbalaj = idCuloareAmbalaj;
 }

 public int getIdAccesoriu() {
  return idAccesoriu;
 }

 public void setIdAccesoriu(int idAccesoriu) {
  this.idAccesoriu = idAccesoriu;
 }

 public int getIdCuloareText() {
  return idCuloareText;
 }

 public void setIdCuloareText(int idCuloareText) {
  this.idCuloareText = idCuloareText;
 }


}
