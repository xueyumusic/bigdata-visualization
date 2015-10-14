/**
 * Created by snowman on 15/10/13.
 */

    //Array.apply([0,7]).random();

var dadata=[270000,230100,245000,210000,263000,248900,221111];
var damargin={top:30, right:20, bottom:20, left:50};
var daxdate=['2015-09-01','2015-09-02','2015-09-03','2015-09-04','2015-09-05','2015-09-06','2015-09-07'];



var dawidth=800-damargin.left-damargin.right;
var daheight=200-damargin.top-damargin.bottom;

var dax=d3.scale.ordinal()
    .domain(daxdate)
    .rangeRoundBands([0,dawidth],.1);

var xAxis=d3.svg.axis()
    .scale(dax)
    .orient('bottom');

var dasvg=d3.select('#dayactivity_area').append('svg')
    .attr('width',dawidth+damargin.left+damargin.right)
    .attr('height',daheight+damargin.top+damargin.bottom)
    .append('g')
    .attr('transform', 'translate('+damargin.left+','+damargin.top+')');

var yscale=d3.scale.linear().domain([0,d3.max(dadata)]).range([0,daheight]);

var barwidth=dawidth/dadata.length;
var bar=dasvg.selectAll('g').data(dadata).enter()
    .append('g')
    .attr('transform', function(d,i) {
        return 'translate(' + i * barwidth + ',0)';
    })

bar.append('rect')
    .attr('y', function(d){
        return daheight - yscale(d);
    })
    .attr('height', function(d) {
        return yscale(d);
    })
    .attr('width', barwidth - 10)
    //.style('fill', 'red');
    .attr('fill', '#2177BB');

bar.append('text')
    .attr('y', function(d) {
        return daheight-yscale(d)-3;
    })
    .text(function(d) {
        return d;
    })

dasvg.append('g')
    .attr('class', 'x axis')
    .attr('transform', 'translate(0,'+ daheight +')')
    .call(xAxis);
