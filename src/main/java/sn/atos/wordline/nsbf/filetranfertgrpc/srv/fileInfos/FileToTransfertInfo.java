/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfos;

import akka.util.ByteString;
import java.util.List;

/**
 *
 * @author A746054
 */
public class FileToTransfertInfo {
    private List<akka.util.ByteString> data  ;
    private String identifiant ;
    private Integer size ;
    private String fileName ;
    private Integer blocNumber ;

    public List<ByteString> getData() {
        return data;
    }

    public void setData(List<ByteString> data) {
        this.data = data;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getBlocNumber() {
        return blocNumber;
    }

    public void setBlocNumber(Integer blocNumber) {
        this.blocNumber = blocNumber;
    }
    
}
