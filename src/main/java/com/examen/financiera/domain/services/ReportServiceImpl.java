package com.examen.financiera.domain.services;

import com.examen.financiera.domain.entities.Report;
import com.examen.financiera.domain.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ReportServiceImpl {

    @Autowired
    private ReportRepositoyImpl reportRepositoy;

    @Override
    public Report createReport(Report report){
        return null;
    }

    @Override
    public List<Report> readReport(){ return reportRepositoy.readReport();}

    @Override
    public Optional<Report> readReportId(Integer id) {
        return reportRepositoy.readReportId(id);
    }

}
