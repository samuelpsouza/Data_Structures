#include <stdlib.h>
#include <math.h>
#include "point.h"

struct point{
    float x;
    float y;
}

Point* create_point(float x, float y){
    Point* point = (Point*) malloc(sizeof(Point));

    if(point!=NULL){
        point->x=x;
        point->y=y;
    }

    return point;
}

void free_point(Point* point){
    free(point);
}

void access_point(Point* point, float* x, float* y){
    *x=point->x;
    *y=point->y;
}

void access_point(Point* point, float* x, float* y){
    point->x=x;
    point->y=y;
}

float distance_between_points(Point* point1, Point* point2){
    float dx = point1->x - point2->x;
    float dy = point1->y - point2->y;

    return sqrt(dx*dx + dy*dy);
}