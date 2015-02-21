package com.tonilopezmr.sample.domain.interactor;

import com.tonilopezmr.interactorexecutor.Executor;
import com.tonilopezmr.interactorexecutor.MainThread;
import com.tonilopezmr.sample.domain.repository.SubjectRepository;

/**
 * @author toni.
 */
public abstract class AbstractSubjectUseCase implements SubjectUseCase {

    private Executor executor;
    private MainThread mainThread;
    private SubjectRepository subjectRepository;

    public AbstractSubjectUseCase(Executor executor, MainThread mainThread, SubjectRepository subjectRepository) {
        this.executor = executor;
        this.mainThread = mainThread;
        this.subjectRepository = subjectRepository;
    }

    public Executor getExecutor() {
        return executor;
    }

    public MainThread getMainThread() {
        return mainThread;
    }

    public SubjectRepository getSubjectRepository() {
        return subjectRepository;
    }
}
