package com.examen.financiera.domain.repositories;

import com.examen.financiera.domain.entities.Report;

import java.util.List;
import java.util.Optional;

public interface ReportRepository {

    Report createReport(Report report);

    List<Report> readReport();

    Optional<Report> readReportId(Integer id);

}
