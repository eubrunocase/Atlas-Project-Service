package com.atlas.Atlas_Project_Service.model;

public enum ProjectStatus {
    AGUARDANDO_ANALISE_PRELIMINAR("aguardando analise preliminar"),
    EM_ANALISE("em analise"),
    PROJETO_RECUSADO("projeto recusado"),
    EM_ANDAMENTO("em andamento"),
    FINALIZADO("finalizado");


    ProjectStatus(String s) {
    }
}
