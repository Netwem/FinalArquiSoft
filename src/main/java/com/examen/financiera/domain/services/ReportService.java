package com.examen.financiera.domain.services;

import com.examen.financiera.domain.entities.Report;

import java.util.List;
import java.util.Optional;

public interface ReportService {

    Report reportCustomer(Report customer);

    List<Report> readReport ();

    Optional<Report> readReportId(Integer id);
}