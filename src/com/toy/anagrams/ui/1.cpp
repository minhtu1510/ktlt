#include <pthread.h>
#include <bits/stdc++.h>

using namespace std;

const int arr = 1000000000;
int* a = new int[arr];

struct ThreadData{
    int threadId;
    int startIndex;
    int endIndex;
};

void* processTime(void* arg){
    ThreadData* thread_Data = (ThreadData*) arg;
    int threadId = thread_Data->threadId;
    int startIndex = thread_Data->startIndex;
    int endIndex = thread_Data->endIndex;

    clock_t start, end;
    for(int j = 0; j < 10; j++){
        start = clock();
    }
    int sum = 0;
    for(int i = startIndex ; i < endIndex; i++){
        sum += a[i];
    }
    end = clock();
    double elasped_time = double (end - start) / CLOCKS_PER_SEC ;
    cout << "sum for thread:  " << threadId <<":"<< sum << endl;
    cout << "Thoi gian xu li: "<< elasped_time << "s" << endl;
    delete thread_Data;
    return NULL;
}

int main(int argc, char const *argv[])
{
    pthread_t tid[4];

    for(int i = 0; i < 4; i++){
        ThreadData* thread_data = new ThreadData();
        thread_data->threadId = i;
        thread_data->startIndex = i * arr/4;
        thread_data->endIndex = (i + 1)* arr/4;
        pthread_create(&tid[i], NULL, processTime, (void*) thread_data);
        
    }
    cout << endl;
    
    for(int i = 0; i < 4; i++){
        
        pthread_join(tid[i], NULL);
    }

    delete[] a;
    return 0;
}
