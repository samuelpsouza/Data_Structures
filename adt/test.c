#include <stdio.h>
#include <stdlib.h>
#include "point.h"

int main(){
    float d;
    Point* p, q;

    p = create_point(10, 21);
    q = create_point(7, 25);

    d = distance_between_points(p, q);
    printf("Distance between P and Q is: %f\n", d);
    
    free_point(p);
    free_point(q);

    system("pause");
    return 0;
}