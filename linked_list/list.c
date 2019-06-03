#include <stdlib.h>
#include "list.h"

typedef struct list List;

struct list {
    int info;
    struct list* next;
}

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