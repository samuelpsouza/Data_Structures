#include <stdio.h>
#include <stdlib.h>
#include "list.h"

int main(void){
    
    List* my_list;
    my_list = create_empty_list();

    my_list = insert_new_element(my_list, 1);
    my_list = insert_new_element(my_list, 2);
    my_list = insert_new_element(my_list, 3);

    to_string(my_list);

    remove_element(my_list, 2);

    printf("After removing element\n");

    to_string(my_list);

    frees_a_list(my_list);

    return 0;
}