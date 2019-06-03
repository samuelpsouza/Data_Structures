typedef struct list List;

List* create_empty_list(void);
void frees_a_list(List* list);
List* insert_new_element(List* list, int info);
List* remove_element(List* list, int value);
int is_empty(List* list);
int size(List* list);
List* get_element(List* list, int value);
void to_string(List* list);
