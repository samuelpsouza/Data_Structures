#include <stdlib.h>
#include "list.h"

typedef struct list List;

struct list {
    int info;
    struct list* next;
};

List* create_empty_list (void) {
    return NULL;
}

void frees_a_list(List* list) {
    List* p = list;
    while(p != NULL) {
        List* temp = p->next;
        free(p);
        p = temp;
    }
}

List* insert_new_element(List* list, int info) {
    List* new = (List*) malloc(sizeof(List));
    new->info = info;
    new->next = list;
    return new;
}

List* remove_element(List* list, int value) {
    List* prev = NULL;
    List* next = list;

    while(next != NULL && next->info != value) {
        prev = next;
        next = next->next;
    }

    if(next == NULL) {
        return list;
    }

    if(prev == NULL) {
        list = next->next;
    } else {
        prev->next = next->next;
    }

    free(next);
    return list;
}

int is_empty(List* list) {
    return (list == NULL) ;
}

int size(List* list) {
    List* temp;
    int counter = 0;

    if(list != NULL){
       for(temp = list; temp != NULL; temp = temp->next){
           ++counter;
       }
    }

    return counter;
}

List* get_element(List* list, int value) {
    List* temp;
    for(temp = list; temp != NULL; temp = temp->next){
        if(temp->info == value){
            return temp;
        }
    }

    return NULL;
}

void to_string(List* list) {
    List* temp;
    for(temp = list; temp != NULL; temp = temp->next){
        printf("Info: %d\n", temp->info);
    }
}