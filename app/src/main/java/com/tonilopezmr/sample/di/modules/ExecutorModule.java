package com.tonilopezmr.sample.di.modules;

import com.tonilopezmr.interactorexecutor.Executor;
import com.tonilopezmr.interactorexecutor.MainThread;
import com.tonilopezmr.interactorexecutor.ThreadExecutor;
import com.tonilopezmr.sample.domain.executor.MainThreadImp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 *
 * @author Toni
 */
@Module(
        complete = false,
        library = true
)
public final class ExecutorModule {

    @Provides
    @Singleton
    public Executor provideThreadExecutor(){
        return new ThreadExecutor();
    }

    @Provides
    @Singleton
    public MainThread provideMainThreadImp(){
        return new MainThreadImp();
    }

}
