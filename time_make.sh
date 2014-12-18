start_time=`date +%s`
make
echo execution time was $(expr `date +%s` - $start_time) seconds
