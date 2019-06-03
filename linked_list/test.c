#include <stdio.h>
#include <stdlib.h>
#include "list.h"

int main(){
    
    List* my_list;
    my_list = create_empty_list();

    my_list = insert_new_element(my_list, 1);
    my_list = insert_new_element(my_list, 2);

    frees_a_list(my_list);
    system("pause");
    return 0;
}